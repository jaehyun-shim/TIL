# REST API의 이해
"Representation State Transfer" are a way of providing interoperability between computer systems on the Internet. 인터넷상의 컴퓨터 시스템간에 상호 운용성을 제공하는 방법.. 즉, 자원을 자원의 표현으로 구분하여 정보를 주고받는 모든것을 의미하며, www과 같은 분산 하이퍼미디어 시스템을 위한 소프트웨어 아키텍처의 한 형식이다. 

History  
--
 - ###배경  
[팀버너스리](https://ko.wikipedia.org/wiki/%ED%8C%80_%EB%B2%84%EB%84%88%EC%8A%A4%EB%A6%AC)는 인터넷 정보 공유 방법으로 정보들을 하이퍼텍스트의 연결로 해답을 찾는다. 표현방식은 HTML 식별자는 URI 전송방식은 HTTP 형태로 설계하였다. HTTP의 주요 저자 중 한 사람인 [Roy Fielding](https://en.wikipedia.org/wiki/Roy_Fielding)은 현재의 아키텍쳐가 WEB의 본래 설계의 우수성을 많이 사용하지 못하고 있다고 판단에, WEB의 장점을 최대한 활용하며 독립적으로 어떻게 WEB을 보존하면서 진보시킬 수 있는 방법으로 고안한 이론으로 MS-Research에서 HTTP Object Model을 발표하게되면서 시작됐다. 2년 뒤 2000년에 박사과정중이었던 로이는 현재 우리가 알고있는 "Representation State Transfer"를 120Page 분량의 박사논문에 정의하여 발표하였다.

- ###선택  
WEB에 API 개념이 생겨나면서 MS는 XML을 이용하여 원격으로 다른 시스템에 메소드를 호출할 수 있는 [프로토콜(XML-RPC)](https://ko.wikipedia.org/wiki/XML-RPC)를 만들고 SOAP란 이름으로 변경한다. 2000년 SOAP를 이용한 salesforce API가 나타나고 4년후 REST를 이용한 flickr API와 비교가 되며 REST의 단순하고 규칙적고 쉬운 환경에 업계는 서비스의 대부분의 API를 REST로 대체한다. 그런데 CMIS와 MS의 REST API Guidelines 본 로이는 전부 RESTAPI 가 아니다고 얘기한다. REST 아키텍쳐 스타일을 따르지않았다는 얘기다. 결국 



salesforce API -SOAP(2000.2) : 복잡, 규칙많음, 어렵다

flickr API - REST(2004.8) : 단순, 규칙적음, 쉽다

2006 AWS 자사 API의 85% REST사용
2010 salesforce REST 추가함.

CMIS (2008)
CMS 를 위한 표쥰(EMC, IBM, MS, 등 작업)
REST 바인딩 지원
-> 로이필딩 : CMIS에는 REST는 없다.

MS REST API Guidelines (2016)
 - uri는 http://{sericeRoot}/{collection}/{id} 형식이어야함
 - GET,PUT,DELETE,POST,HEAD,PATCH,OPTIONS 를 지원해야함
 - API 버저닝은 Major.minor로 하고 uri에 버전 정보를 포함시킨다. 등등

-> 로이필딩 : REST-API 아니라 HTTP-API 이다.
-> REST APIs must be hypertext-driven
-> Rest-API를 위한 최고의 버저닝 전략은 버저닝을 안하는것이다.

문제는 무엇일까?
-> Rest는 분산 하이퍼 미디어 시스템(WEB) 을 위한 아키텍쳐 스타일
-> 아키텍쳐스타일(제약조건의 집합)
-> 하이브리드 아키텍쳐스타일로 구성요소
 - client-server
 - stateless
 - cache
 - uniform interface
 - layered system
 - code-on-demand(optional) : 서버에서클라이언트로운영가능(자바스크립트)


uniform interface 제약조건
 - identification of resources : 리소스가 uri로 식별기능.
 - manipuation of resources through representations : 메세지로 리소스 CRUD제어가능
 -/ self-descriptive messages : 메세지는 스스로 설명할줄알아야한다.
  -> GET / HTTP/1.1 : 스스로 설명 하지못함. 목적지가빠짐
  -> HTTP/ 1.1 200 OK [{"op":remove,"path":"/a/s/d"}] : 스스로 설명 하지못함. 어떤문법인지 파악어려움 (Json), op,path ??
  -> HTTP/ 1.1 200 OK Content-Type : application/json-patch+json

 -/ hypermedia as the engine of application state(HATEOAS) : 애플리케이션의 상태는 Hyperlink를 이용해 전이되어야한다.


 독립적진화
 - 서버와 클라이언트가 각각 독립적으로 진화
 - 서버의 기능이 변경되어도 클라이언트를 업데이트할 필요가 없다.
 - REST응 만들게된 계기 : http를 고치면 웹이 깨질것같은데...
 - uniform interface를 만족해야함.
 - ex) WEB : 웹페이지변경 후에도 브라우져를 업데이트할필요없다.
 	브라우저를 업데이트했다고 웹페이지를 변경할필요도없다.
 	http/html 명세가 변경되어도 웹은 잘동작한다.
 	웹의 uniform interface를 위한 노력 W3C Working groups(html), IETF Working groups(http)
 	웹브라우저 개발자, 웹서버 개발자
 	HTML5첫초안에서 권고안 나오는데까지 6년 HTTP/1.1(1999) 명세 개정판 작업하는데 7년
 	기능추가없이 하위 호환성을 깨뜨리지 않기 위한 토론하여 문서화시킴
 	상호운용성에 대한 집착
 	 - referer r이 빠짐 오타지만 안고침
 	 - charset 인코딩이란 이름을 잘못지은이름도 안고침
 	 - HTTP 상태코드 416 포기함 뛰어넘어 417로이어감. hpcp 란 포로토콜에서 잘못만들어진 구현체가 존재하기때문에 안씀
 	 - HTTP/0.9 아직 지원함

 	 Netscape 6.0은 지원하지않습니다. -  이제 거의 안나옴.
 	 REST가 웹의 독립적 진화에 도움줬나?
 	  - Host헤더추가
 	  - 길이제한(414URI Too Long)
 	  - URI 에서 리소스의 정의가 추상적으로 변경됨 "문서의 위치" 식별하고자하는 무언가
 	  - Http/1.1명세 최신판에서 Rest에 대한 언급이들어감
 	  - 로이필딩이 http와 URI명세의 저자중 한명이기때문 언급이유.

 	 Rest는 SOAP보다 사용하기 쉽고 간편한줄만알았는데 복잡하고 어렵다.
 	 이 REST 제약조건을 모두 맞춰가며 시스템을 구현하는사례는 적다.
 	 그래서 이렇게 굳이 제약조건을 전부 따져가며 구축을해야하는가? 
 	 로이필드는 시스템전체를 통제(서버와 클라이언트를 전체를 제어)할수 있다고 생각하거나, 
 	 진화에 관심이 없다면 REST에 대해 따지느라 시간을 낭비하지나라.
 	 라고 답변했다. 

로이필딩은 현재 REST 조건에 따르지않고 HTTP-API 형태 임에도 불구 명칭을 REST-API라고 칭하는 관계자들에게
제발 제약도건에 따르던제 아니면 다른단어를 써라라고 전달했다.


하지만 사실 구조가체가 다르다. REST를 따를수있는 대샹이 웹페이지와 http-api 는 기계와 사람이기때문에
mediaType 이 시각적인 측면에서 html과 json으로 구분되기때문이다. 
즉, REST제약조건중 HETEOAS(Hyperlink) 와 self-descriptive 가 다르기떄문에  HTTP-API로는 
```<a href=""></a>```정의도 안되며 HTML처럼 각태그에 대한 명세를 단순 키/값으로는 따라가긴 어렵다.

JSON도 구현가능하다.



## References  
- [https://ko.wikipedia.org/wiki/REST](https://ko.wikipedia.org/wiki/REST)  
- [https://blog.toss.im/2017/10/25/team/people/toss-developer-deview-conference/](https://blog.toss.im/2017/10/25/team/people/toss-developer-deview-conference/)