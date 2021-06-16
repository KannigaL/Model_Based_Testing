function vecmin(vs::Vector{Float64})
    currentmin = Inf # Set a very large number as starting point
    for index in 1:length(vs)
        if vs[index] < currentmin
            currentmin = vs[index]
        end
    end
    return currentmin
end
