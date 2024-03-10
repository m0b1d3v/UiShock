# Shortcut command to run Gradle Wrapper in the code directory
gradle = cd code && ./gradlew

all:
	cat --number Makefile

build:
	$(gradle) assembleBootDist

buildToolUpdate:
	$(gradle) wrapper --gradle-version latest

clean:
	$(gradle) clean

dependencies:
	$(gradle) dependencies

dependenciesUpdates:
	$(gradle) dependencyUpdates

dependenciesVulnerabilities:
	$(gradle) dependencyCheckAnalyze

run:
	$(gradle) bootRun

tasks:
	$(gradle) tasks

test:
	$(gradle) test

testI:
	$(gradle) test --tests '*IntegrationTest'

testU:
	$(gradle) test --tests '*UnitTest'
