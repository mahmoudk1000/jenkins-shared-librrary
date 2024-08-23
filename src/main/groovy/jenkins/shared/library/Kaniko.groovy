#!/usr/bin/env groovy
/*
 * This Groovy source file was generated by the Gradle 'init' task.
 */
package main.groovy.jenkins.shared.library

class Kaniko implements Serializable {
    def script

    Kaniko(script) {
        this.script = script
    }

    def buildPush(String imageName, String tag, Map<String) {
            script.sh label: "Build and push image $imageName:$tag",
                    script: "executor -f $WORKSPACE/.pipeline/Dockerfile --context `pwd` --destination mahmoudk1000/$imageName:$tag"
    }

}
