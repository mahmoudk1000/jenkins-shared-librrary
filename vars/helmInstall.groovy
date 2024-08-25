#!/usr/bin/env groovy
import main.groovy.jenkins.shared.library.Helm

def call(String appName, String valuesFileName, String tag, String nameSpace) {
    return new Helm(this).installChart(appName, valuesFileName, tag, nameSpace)
}
