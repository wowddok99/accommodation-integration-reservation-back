# 🚗 숙박 및 지역 상품 연계 플랫폼 개발 - Backend  

[![Contributors](https://img.shields.io/badge/contributors-4-brightgreen)](#-기여자-contributors)  

![image](https://github.com/user-attachments/assets/4f972fea-97ce-48ef-b1d8-2cac00854368) 
![image](https://github.com/user-attachments/assets/b5aa028d-4c55-433a-94f6-715c08653583)

이 프로젝트는 경주 지역의 숙박 및 지역 상품을 개인과 연결해주는 웹 서비스의 백엔드 애플리케이션입니다. 데이터베이스 설계, 추천 알고리즘 로직 구현, API 제공을 통해 안정적이고 효율적인 맞춤형 숙박 예약 서비스 환경을 제공합니다.  

---
## 시연영상
https://www.youtube.com/watch?v=s-id_5Icpf8

---

## 🧑‍💻 기여자  
| 이름      | Github 프로필     | 역할            |  
|-----------|-----------------|-----------------|  
| 권민지     | [mjgwon24](https://github.com/mjgwon24) | frontend & backend & design |
| 김이현     | [lh7721004](https://github.com/lh7721004) | frontend & backend |  
| 전상은 | [wowddok99](https://github.com/wowddok99) | frontend & backend |  
| 전형주     | [kavu-multi](https://github.com/kavu-multi) | AI/ML Engineer |  

---

## 👩‍💻 주요 기능  
- **사용자 맞춤형 추천 API**: AI 기반 알고리즘을 통해 개인화된 저녁메뉴를 추천합니다.  
- **데이터베이스 관리**: MySQL 및 JPA를 사용해 숙박 및 지역 재료 데이터, 사용자 예약 데이터, SNS 인증 데이터를 효과적으로 관리합니다.  
- **RESTful API 설계**: 안정적이고 효율적인 클라이언트-서버 통신을 지원합니다.  
- **Swagger 문서화**: API 명세를 자동화하여 개발 편의성을 향상시킵니다.  

---

## 🛠️ 기술 스택  
- **Backend Framework**: Spring Boot  
- **Database**: MySQL  
- **ORM**: JPA (Hibernate)  
- **API Documentation**: Swagger  
- **Build Tool**: Gradle  

---

## 📁 프로젝트 구조  
```
accommodation-integration-reservation-back  
├── src/main/java/ # Java 소스 코드  
│   ├── tour_recommend/tour_recommend_back/
│       ├── config/ # 환경 및 설정 관련 파일  
│       ├── controller/ # API 엔드포인트 정의  
│       ├── service/ # 비즈니스 로직  
│       ├── repository/ # 데이터베이스 접근 계층
│       └── etity/ # 데이터베이스 테이블과 매핑되는 JPA 엔티티 클래스  
├── src/main/resources/   
│   └── static/ # 정적 리소스  
├── build.gradle # 빌드 설정 파일  
├── settings.gradle # 프로젝트 설정 파일  
├── gradlew/gradlew.bat # Gradle 실행 파일  
└── .gitignore # Git 무시 파일  
```  

---

## 📝 설치 및 실행  

1. 저장소 클론  
   ```bash  
   git clone https://github.com/wowddok99/accommodation-integration-reservation-back.git
   cd accommodation-integration-reservation-back
   ```  

2. Gradle 의존성 설치  
   ```bash  
   ./gradlew build  
   ```  

3. 애플리케이션 실행  
   ```bash  
   ./gradlew bootRun  
   ```  

4. API 문서 확인  
   - Swagger 문서: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)  

---

## 📬 문의  

프로젝트 관련 문의는 GitHub Issues 또는 아래 연락처로 보내주세요.  

- **Github:** [wowddok99](https://github.com/wowddok99)  
- **이메일:** wowddok99@gmail.com  
