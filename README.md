# instagrab-java
Simple Grabber for Instagram pics (extracts pic url)

Requirements :

1) Java

2) Maven

3) GNUmake



Steps :

1) CD to the project folder and run 'make jar' command

2) Run the project with 'make run ex_url', where ex_url is the url of the instagram pic you want to grab.


Bypass : 

1) Used Selenium driver to open Chrome through chromedriver



Next Immediate Steps:

1) Driver is open infinitely, to make sure user sees the image. Have to figure a way to close the image and make the driver quit then.



Thoughts:

1) Opening chrome doesn't have native support, so planning to move to JS

2) Will pack it up as extension for Google chrome to make it more integrated.

