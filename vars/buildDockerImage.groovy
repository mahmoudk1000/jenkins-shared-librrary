#!/usr/bin/env groovy
import main.groovy.jenkins.shared.library.Docker

def call(String imageName) {
    return new Docker(this).buildDockerImage(imageName)
}
