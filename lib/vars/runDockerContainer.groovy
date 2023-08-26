#!/usr/bin/env groovy
import main.groovy.jenkins.shared.library.Docker

def call(String containerName, String containerTag, List<String> options = []) {
    return new Docker(this).runDockerContainer(containerName, containerTag, options)
