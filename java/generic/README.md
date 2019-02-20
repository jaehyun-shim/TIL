# 제네릭스(Generics)
##### < Type > 으로 표현하고 명확한 타입체크가 가능해진다. 미사용시 저장된 데이터 타입이 자동으로 Object 로 인식되어 getData 마다 타입을 형변환을 해줘야하는 번거로움과 잘못된 형변환으로 인한 오류가 발생할 소지가 있다. Collection, Lambda, Stream, NIO에서 주로 사용되며 클래스, 인터페이스, 메소드 정의시 타입(type)을 파라미터로 사용할 수 있도록 함

### Generic Type Parameter Naming 지정 규칙
규칙에 따라 Type Parameter Naming은 대문자 단일 문자입니다. 이것은 유형 변수와 일반 클래스 또는 인터페이스 이름의 차이를 구분에 도움을 준다.

	E - Element (Java Collections Framework 에서 광범위하게 사용)  
	K - Key  
	N - Number  
	T - Type  
	V - Value  

### 테스트
 - 타입 `<T>` 기본클래스 생성  
<pre>
class TestClass<<strong>T</strong>> {
&nbsp;&nbsp;&nbsp;&nbsp;private <strong>T</strong> t;
&nbsp;&nbsp;&nbsp;&nbsp;public <strong>T</strong> get() { return t; }
&nbsp;&nbsp;&nbsp;&nbsp;public void set(<strong>T</strong> t) { this.t = t; }
}
</pre>
 - 객체생성  
 `TestClass<String> testClass = new TestClass<String>();`

 
 - 기존 기본클래스 타입 변경됨  
<pre>
class TestClass<<strong>String</strong>> {
&nbsp;&nbsp;&nbsp;&nbsp;private <strong>String</strong> t;
&nbsp;&nbsp;&nbsp;&nbsp;public <strong>String</strong> get() { return t; }
&nbsp;&nbsp;&nbsp;&nbsp;public void set(<strong>String</strong> t) { this.t = t; }
}
</pre>

