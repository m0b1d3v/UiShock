# Shortcut command to run Gradle Wrapper in the code directory
gradle = cd code && ./gradlew

# Sonarcloud analysis token
SONAR_TOKEN ?= $(error SONAR_TOKEN environment variable is missing)

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

sonar: clean test
	$(gradle) sonar

tasks:
	$(gradle) tasks

test:
	$(gradle) test

testI:
	$(gradle) test --tests '*IntegrationTest'

testU:
	$(gradle) test --tests '*UnitTest'
