[HandlerMethodArgumentResolver 사용하기]   
1.-HandlerMethodArgumentResolver를 구현한 resolver클래스를 생성한다.   
  -supportsParameter, resolveArgument 2개의 메소드를 오버라이딩 한다.    
2. supportsParameter 메서드는 컨트롤러 메서드 인자에 설정한 객체가가 있는지 검사한다. 있으면 true   
3. resolveArgument에 컨트롤러에서 인자로 넘어온 파라미터의 값을 nativeWebRequest.getParameter() 메소드를 통해 처리할수 있다.   
4. WebConfig 설정 클래스에 addArgumentResolver 메서드를 오버라이딩한다.   
5. addArgumentResolver 메서드에 아규먼트 리졸버를 등록한다.   
   
   
[h2 데이터베이스 설정]   
1. h2database, starter-jdbc 의존성 추가   
2. application.yml 설정 (h2 console, datasource)   
3. schema.sql 파일에 ddl정의, data.sql파일에 dml정의       
4. initialization-mode: always 옵션을 주면 springboot가 실행될 때 마다 db초기화   
   
   
[SpringJdbc 사용하기]   
1. 
