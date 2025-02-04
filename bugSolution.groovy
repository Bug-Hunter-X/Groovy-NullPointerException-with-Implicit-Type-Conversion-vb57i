```groovy
def myMethod(a, b) {
  def aVal = a ?: 0 // Use the Elvis operator to handle nulls
  def bVal = b ?: 0 // Use the Elvis operator to handle nulls
  return aVal + bVal
}

println myMethod(1, 2) // 3
println myMethod(null, 2) // 2
println myMethod(1, null) // 1
println myMethod(null, null) // 0
```