#!/usr/bin/env groovy
import main.groovy.jenkins.shared.library.Kaniko

def call(String regDest, String imageName, String tag) {
    return new Kaniko(this).buildPush(regDest, imageName, tag)
}
