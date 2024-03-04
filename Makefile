# Shortcut command to run Gradle Wrapper in the code directory
gradle = cd code && ./gradlew

all:
	cat --number Makefile

build:
	$(gradle) assembleDist

buildToolUpdate:
	$(gradle) wrapper --gradle-version latest

checkDependencies:
	$(gradle) dependencyUpdates

checkVulnerabilities:
	$(gradle) dependencyCheckAnalyze

clean:
	$(gradle) clean

run:
	$(gradle) run

tasks:
	$(gradle) tasks

test:
	$(gradle) test

testI:
	$(gradle) test --tests '*IntegrationTest'

testU:
	$(gradle) test --tests '*UnitTest'
