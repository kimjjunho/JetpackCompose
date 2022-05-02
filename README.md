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

### Row

```kotlin
@Composable
fun Greeting(name: String) {
    Row{
        Text(text = name)
        Text(text = "Hello $name!")
    }
}
//요소를 수평으로 정렬
```

### Box

```kotlin
@Composable
fun Greeting(name: String) {
    Box{
        Text(text = "Hello $name!")
        Text(text = "Hello $name!")
    }
}
//요소를 쌓을 수 있음
```

### Image

```kotlin
@Composable
fun Greeting(name: String) {
    Row{
        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "") //이미지를 추가하는 코드, contentDescription : 이미지를 대체할 설명
        Column{
            Text(text = "이름 : $name!")
            Text(text = "특징 : 귀엽게 생김")
        }
    }
}
```

