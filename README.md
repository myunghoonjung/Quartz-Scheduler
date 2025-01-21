# Quartz-Scheduler

이 프로젝트는 **Spring Boot**와 **Quartz 스케줄러**를 통합하여 **잡 스케줄링**을 처리하는 예제입니다.

## 주요 기능
- Quartz를 사용한 잡 스케줄링
- 데이터베이스에 **Job**과 **Trigger** 저장
- `JobDetail`과 `Trigger`를 통한 **잡**과 **트리거** 관리

## 설정 방법

1. **Java 17 이상**을 설치합니다.
2. **MySQL** 데이터베이스를 설정하거나 **H2** 데이터베이스를 사용할 수 있습니다.
3. `application.yml`에서 데이터베이스 연결 정보를 설정합니다. (현재 주석 처리되어 있습니다.)
4. `Application.java`를 실행하여 애플리케이션을 시작합니다.

```bash
