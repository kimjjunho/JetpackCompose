# JetpackCompose





### 풀 화면 보기

```kotlin
@Preview(showBackground = true) //기본
@Preview(showSystemUi = true, showBackground = true) //풀 화면으로 보여줌
```

### Column

```kotlin
@Composable
fun Greeting(name: String) {
    Column{
        Text(text = name)
        Text(text = "Hello $name!")
    }
}
//요소를 수직으로 정렬
```

