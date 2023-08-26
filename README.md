# Jenkins Shared Library - (WIP)

![Jenkins Logo](https://jenkins.io/images/logo-title-opengraph.png)

Welcome to the Jenkins Shared Library project! This repository contains a collection of utility functions and classes aimed at streamlining and enhancing Jenkins pipeline development. This README provides an overview of the current progress, focusing on the `Docker` class and its functioning methods.

## Table of Contents

- [Introduction](#introduction)
- [Classes](#classes)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The Jenkins Shared Library is designed to centralize common functionality used across multiple Jenkins pipelines. By encapsulating reusable code, you can ensure consistency, reduce redundancy, and simplify maintenance in your Jenkins CI/CD processes.

## Classes

### Docker Class

#### Overview

The `Docker` class in this shared library provides functions for interacting with Docker containers and images. It simplifies tasks related to building, running, and managing Docker containers within Jenkins pipelines.

#### Available Methods

- `Docker.dockerLogin()`: Login to docker default registr using `credentialsId`; 'docker-hub'.

- `Docker.customDockerLogin(username, password, registryUrl)`: Login to private docker registry. 

- `Docker.buildDockerImage(imageName, dockerfilePath, buildArgs)`: Build a Docker image using the specified Dockerfile and build arguments.

- `Docker.dockerPushImage(imageName)`: Push image to docker registry.

- `Docker.runDockerContainer(imageName, options, containerName)`: Run a Docker container from the specified image, allowing you to provide custom options.

#### Example Usage

Here's an example of how to use the `Docker` class in your Jenkins pipeline:

```groovy
@Library('my-shared-library') _
import com.example.Docker

node {
    stage('Build Docker Image') {
        def docker = new Docker()
        def imageName = 'my-app:latest'
        def dockerfilePath = 'Dockerfile'
        def buildArgs = ['VERSION=1.0', 'DEBUG=true']

        docker.buildImage(imageName, dockerfilePath, buildArgs)
    }
}
```

or

```groovy
library identifier: 'jenkins-shared-librrary@master', retriver: modernSCM(
    [
        $class: 'GitSCMSource',
        remote: 'https://github.com/mahmoudk1000/jenkins-shared-librrary.git',
        credentialsId: 'github-credential'
    ]
)
```

## Usage

To utilize this shared library in your Jenkins pipelines, follow these steps:

1. In your Jenkins pipeline script, import the shared library:

```groovy
@jenkins-shared-librrary_
```

2. Import the relevant classes, such as Docker, and use the available methods as demonstrated in the example above.

## Contributing

Contributions to this shared library are welcome! If you'd like to contribute:

    Fork this repository and create a new branch for your changes.
    Make your changes and add tests if applicable.
    Open a pull request explaining the changes and their benefits.

## License

This Jenkins Shared Library is open-source and available under the MIT License.

    Replace placeholders such as `my-shared-library` with your actual shared library's name and `com.example.Docker` with the appropriate package and class names.

    Ensure that the README is comprehensive, easy to understand, and well-structured. It should provide users with clear instructions on how to use the shared library, what to expect from it, and how they can contribute to its development.
