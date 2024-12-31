```groovy
def myMethod(Map params) {
  // Assume params contains a nested map with key 'nested'
  def nested = params.nested

  // Accessing a nested map element with safe navigation and default value
  def value = nested?.someKey ?: "Default Value"

  println "Value: $value"
}

myMethod( [nested:[someKey: 1]])
myMethod( [nested: null])
myMethod( [nested:[ ]])
```