## Part 2 
Case study: Find a software/lib that uses the testing tool

Mozilla Firefox has used american fuzzy lop multiple times. [Here](https://bugzilla.mozilla.org/show_bug.cgi?id=1045977) is a bug example.

* **Q2.1. What is the purpose of the sw/lib, i.e. what does it aim to do for users/developers?** Mozilla Firefox is a free and open-source web browser developed by The Mozilla Foundation and its subsidiary, Mozilla Corporation. 

* **Q2.2. What are the key technologies used to develop the lib?** 
  - Rendering engine: Gecko, C++ 
  - JavaScript engine: SpiderMonkey, C 
  - UI: Mostly XUL (a custom XML dialect), CSS, and JavaScript, with some C++.

* **Q2.3. What kind of automated testing tools are used to test the sw/lib (including but possible more than YTT) and what are their key features?** Mozilla uses multiple automated testing tools for different purposes as you can see [here](https://developer.mozilla.org/en-US/docs/Mozilla/QA/Automated_testing). They use various automated testing tools for linting and functional testing. Lint tests help to ensure better quality, less error-prone code by analysing the code with a linter. They use functional testing in order to test the JavaScript engine's implementation of the JavaScript language, that pages load without crashing, asserting, or leaking, moreover to test the accessibility interfaces and many others uses.

* **Q2.4. Which features of the automated testing tools are currently used by the test suite?**
They use multiple tools as I mentioned before, so some references of the features are: from the SpiderMonkey automation tool they use the SpiderMonkey engine shell feature and using the Autophone tool they measure the performance and select Unit Tests on Android devices.

* **Q2.5. Which features of the automated testing tools are NOT used by the test suite?** Actually, I am not sure. There are some mentions of the features that they use but I don't think that is correct to suppose that if they do not mention a feature that means that they don't use it.

## Part 3 
Interview developers/testers of YTT

* **Q3.1. Reach out to the developers of YTT and ask them about their reasons for developing YTT. Why this particular type of testing technology? Which situations is it good for and less good for?** Waiting for an answer. I sent an email to research_requests@mozilla.com :email:

* **Q3.2 Ask them how mature they think YTT is? Is it suitable for use by companies developing real-world software at scale? Why / why not?** Waiting for an answer. I sent an email to research_requests@mozilla.com :email:

* **Q3.3. Ask them how they plan to evolve and develop YTT going forward. What are the main improvements needed to take the tool to the next level?** Waiting for an answer. I sent an email to research_requests@mozilla.com :email: