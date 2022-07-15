# MyFormaterApplication

The goal of this exercise is to refactor MyFormaterApplication.

The application formats hardcoded strings and displays them on the standard output.

### Instructions

Input of the application is a key-value formatted String formatted on 2 lines:
<pre>
type=&lt;the type&gt;
content=&lt;the content&gt;
</pre>
Output of the application is a type dependent String:
<pre>
&lt;the formatted content&gt;
</pre>

First, provide the missing implementation for:
* public static String getType(String s)
* public static String getContent(String s)
* public static String formatAType(String s)
* public static String formatDefaultType(String s)

MyFormaterApplicationTest class must run successfully. 
Commit at this step.

Then, refactor MyApplication using at least:
* an Input class representing the input
* an Output class representing the output
* Design patterns when needed
* Unit Tests

Framework as SpringBoot can be used.

### Delivery

The delivery includes a **private** GIT repository. The sources should be documented, tested and ready to deliver in production (clean and without useless code).

Think about the code readability (style, structure and comments) and add tests to cover edge cases.




