# ServiceLoader Example



#### ServiceLoader

- jar 만 교체 했을때, 인터페이스의 구현체 를 가져올 수 있음

- 인터페이스의 구현 정보를 resources/**META-INF/services** 폴더에 **인터페이스에 대한 정보 파일** 추가 하여, `ServiceLoader` 가 알수 있도록 한다
  > 인터페이스 정보 파일 규칙
  >
  > - 파일 명 : 인터페이스 풀 네임
  > - 파일 내용 : 구현한 클래스 풀 네임 (여러개인 경우, 추가 할수 있음)



#### Test

```shell
module-inter $ gradle install #local maven 경로에 모듈(tocgic.exam.module.inter) 설치
module-impl1 $ gradle install #local maven 경로에 모듈(tocgic.exam.module.impl1) 설치
main $ gradle run
```

