```groovy
def myMethod(Map params) {
  // Assume params contains a nested map with key 'nested'
  def nested = params.nested

  // Accessing a nested map element
  def value = nested?.someKey

  // The bug: NullPointerException if 'nested' or 'someKey' is null
  println "Value: "+ value
}

myMethod( [nested:[someKey: 1]])
myMethod( [nested: null])
myMethod( [nested:[ ]])
```