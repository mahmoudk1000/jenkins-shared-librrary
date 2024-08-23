#!/usr/bin/env groovy
import main.groovy.jenkins.shared.library.Kaniko

def call(String imageName, String tag) {
    return new Kaniko(this).buildPush(imageName, tag)
}
