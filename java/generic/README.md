# 제네릭스(Generics)
##### < Type > 으로 표현하고 명확한 타입체크가 가능해진다. 미사용시 저장된 데이터 타입이 자동으로 Object 로 인식되어 getData 마다 타입을 형변환을 해줘야하는 번거로움과 잘못된 형변환으로 인한 오류가 발생할 소지가 있다. Collection, Lambda, Stream, NIO에서 주로 사용되며 클래스, 인터페이스, 메소드 정의시 타입(type)을 파라미터로 사용할 수 있도록 함

### Generic Type Parameter Naming 지정 규칙
규칙에 따라 Type Parameter Naming은 대문자 단일 문자입니다. 이것은 유형 변수와 일반 클래스 또는 인터페이스 이름의 차이를 구분에 도움을 준다.

	E - Element (Java Collections Framework 에서 광범위하게 사용)  
	K - Key  
	N - Number  
	T - Type  
	V - Value  

### 제네릭 클래스 / 인터페이스 타입(`class<T>, interface<T>`)
---
 - 타입 `<T>` 기본클래스 생성  
클래스 내부에서 사용될 자료형을 지정하는 것으로 ArrayList를 예로들면 ArrayList<T>로 선언되어 있으며, 해당 객체를 생성할때 T의 타입이 정해진다.<br>
<pre>
class TestClass<<strong>T</strong>> {
&nbsp;&nbsp;&nbsp;&nbsp;private <strong>T</strong> t;
&nbsp;&nbsp;&nbsp;&nbsp;public <strong>T</strong> get() { return t; }
&nbsp;&nbsp;&nbsp;&nbsp;public void set(<strong>T</strong> t) { this.t = t; }
}
</pre>
 
 - 기존 기본클래스 타입 변경됨  
<pre>
class TestClass<<strong>String</strong>> {
&nbsp;&nbsp;&nbsp;&nbsp;private <strong>String</strong> t;
&nbsp;&nbsp;&nbsp;&nbsp;public <strong>String</strong> get() { return t; }
&nbsp;&nbsp;&nbsp;&nbsp;public void set(<strong>String</strong> t) { this.t = t; }
}
</pre>  

- 객체생성 비교   
 - 제네릭 타입   
 `List<T> list = new ArrayList<>();`  
   
		GenericClass g = new GenericClass();  
		g.set("제네릭");   
		g.getGeneric(); // 타입그대로사용  
		 
	
 - 오브젝트 타입  
 `List<Object> list = new ArrayList<>();`  
  
		 ObjectClass o = new ObjectClass();  
		 o.set(1);  
		 (Integer)o.getGeneric(); // 타입(Integer) 변환하여사용  


- 제네릭 인터페이스 사용방법


### 제네릭 메소드 타입(`<T, R> class<R> R method(T t)`)

- 두개 이상의 파라미터에 각각 제네릭을 설정하는 방법  
public <T1, T2> Integer genericMethod(T1 t1, T2 t2)

- 제네릭 클래스를 리턴타입으로 정의하는 방법  
public <String> genericClass<String> genericMethod()

- 메소드의 파라미터에 T가 선언되어 있는경우 리턴타입 바로앞에 <T> 제너릭 타입을 선언하는방법  
public static <T> List<T> genericMethod(List<T> list, T item)


### WildCard Generic Type(`<?>`)
 - 물음표로 사용되며 타입명에 대해 제한 않음을 의미한다. 사용방법은 아래와 같다.  
	- ####`<?>` 타입 변수에 모든 타입을 사용할 수 있음.  
  	 - 사용방법1  

   
   - ####`<? extends T>` T 타입과 T 타입을 상속받는 자손 클래스 타입만을 사용할 수 있음.
	 - 사용방법2  

   
  - ####`<? super T>` T 타입과 T 타입이 상속받은 조상 클래스 타입만을 사용할 수 있음.  
	 - 사용방법3  

   
 
  
