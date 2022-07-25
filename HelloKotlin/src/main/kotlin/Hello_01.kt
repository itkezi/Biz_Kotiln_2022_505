fun main() {
    // num1 변수를 정수형으로 선언하고 10으로 초기화
    var num1 = 10

    // 이미 num1 이 정수형으로 선언되었는데
    // 문자열을 저장하려고 시도하니 오류 발생
    // num1 = "String"

    // num2 변수를 정수형으로 선언하고 20으로 초기화
    var num2 = 20

    var sum = num1 + num2;

    // 문자열 Template : 문자열 내에 변수를 직접 사용하여
    // 결과를 출력하는 방법
    println("$num1 + $num2 = $sum")


    // 변수를 선언할 때 초기화 없이 강제 형 지정하여 선언하기
    // Kotlin 에서는 권장 X
    var num3 : Int;

    var nation : String
    nation = "대한민국"

    // val : 상수형 ( final, Read Only = const)
    val korea = "대한민국"
    // korea = "변수바꾸기"; -> 오류남

    println("${korea}은 Republic Of Korea")
    for(i in 0..10) {
        println("반복문으로 ${i}만들기")
    }
    println()

    // 0 ~ 10 까지 반복하는데 2씩 증가하기
    for(i in 0..10 step(2)) {
        println("step(2) 사용하기 : $i")
    }

    for (i in 10 downTo 0) {
        println("downTo 사용하기 : $i")
    }

    for (i in 10 downTo 0 step(2)) {
        println("downTo, step(2) 사용하기 : $i")
    }
    
    var bYes = true
    if(bYes) {
        println("${bYes}는 참")
    } else {
        println("${bYes}는 거짓")
    }
    
    // 정수형 요소를 포함하는 배열 선언
    var array1 = intArrayOf(10,20,30,40,50,60,70)
    
    // 배열 요소 0부터 전체 리스트 보기
    for(ar in array1) {
        println("$ar")
    }

    // 베열 요소 끝에서부터 0방향으로 리스트보기
    for(ar in array1.reversed()) {
        println("$ar")
    }

    // 0부터 배열의 개수 - 1 : until
    for(i in 0 until array1.count()) {
        println("${array1[i]}")
    }

    var num4 = 1;
    while (num4 < 10) {
        print("${num4++} ,")
    }

}