# IHello Interface 구현모듈

ServiceLoader 에서 사용될 수 있도록, resources/`META-INF/services` 폴더에 `인터페이스에 대한 정보 파일` 추가

- 파일 규칙
  - 파일 명 : 인터페이스 풀 네임
  - 파일 내용 : 구현한 클래스 풀 네임 (여러개인 경우, 추가 할수 있음)