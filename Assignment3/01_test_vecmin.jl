using Test

include("01_implementation_vecmin.jl")

property_vecmin_length1(n::Number) =
    vecmin([n]) == n

function makefloat64generator(maxvalue = 1000.0)
    function datagenerator()
        rand() * maxvalue
    end
    datagenerator
end

function dataminimizer(property::Function, d::Float64; numtries = 1000)
    for t in 1:(numtries-10)
        if rand() < 0.5
            newd = d / (2 + rand())
        else
            newd = d - (rand()*1000.0)
        end
        if property(newd) == false
            d = newd
        end
    end
    for t in 1:10
        divisor = 10^(rand(1:5))
        newd = float(round(Int, d/divisor) * divisor)
        if property(newd) == false
            d = newd
        end
    end
    return d
end

function propcheck(property::Function, generator::Function; N = 100)
    for i in 1:N
        d = generator()
        propistrue = (property(d) == true)
        if propistrue
            @test true
        else
            minimald = dataminimizer(property, d)
            @test "Property is false for data $(minimald) (starting from $d)" == 1
            break
        end
    end
end

@testset "vecmin property-based tests" begin
    propcheck(property_vecmin_length1, makefloat64generator(100.0))
    propcheck(property_vecmin_length1, makefloat64generator(1e50); N = 1_000_000)
end
