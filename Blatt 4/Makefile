.Phony: all compile run

all: run

compile:
	bash generateAntlrFiles.sh
	cat pom.xml | sed -e 's/>18</>11</g' -e 's/<version>4\.11\.1<\/version>/<version>4\.7\.2<\/version>/g' > newpom.xml
	mv pom.xml pom.xml.bak
	mv newpom.xml pom.xml
	mvn compile
	mv pom.xml.bak pom.xml

run: compile
	sh interpret.sh

