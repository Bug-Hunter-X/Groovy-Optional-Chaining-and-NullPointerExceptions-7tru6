# Groovy Optional Chaining and NullPointerExceptions

This repository demonstrates a potential issue with Groovy's optional chaining operator ("?.") when dealing with nested maps.  While ?. is designed to prevent NullPointerExceptions, it doesn't fully protect against all scenarios.  This example highlights how an unexpected NullPointerException can occur even when using optional chaining.

## Bug Description

The `myMethod` function attempts to access a nested element within a map using ?.  If either the nested map or the target key is null, a NullPointerException is thrown despite using optional chaining.

## Solution

The solution involves adding explicit null checks or using Groovy's safe navigation operator (`?.`) with a default value. See the `bugSolution.groovy` file for a corrected version.

## How to reproduce

1. Clone this repository.
2. Run `groovy bug.groovy`. Observe the NullPointerException in one of the calls.
3. Run `groovy bugSolution.groovy` to see the corrected output.