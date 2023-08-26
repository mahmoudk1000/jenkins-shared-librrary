#!/usr/bin/env groovy
import main.groovy.jenkins.shared.library.Docker

def call(String username, String password, String registryUrl) {
    return new Docker(this).customDockerLogin(username, password, registryUrl)
}
