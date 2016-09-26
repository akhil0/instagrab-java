# 
#

JFLAGS = -g
JC = javac

JARFILEPATH = `pwd`/target/instagrab-0.0.1-SNAPSHOT-jar-with-dependencies.jar
URL = https://www.instagram.com/p/BKydUtvA3Jc/?

#
# the default make target entry
#


default: 
	mvn install

local:
	java -jar $(JARFILEPATH) $(URL)

