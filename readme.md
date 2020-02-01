#### Reactive App with Angular and Spring Boot 2

The application was created during an online course

---

Run Spring Boot back-end part:
```
gradlew bootRun
```
Run Angular front-end part:
```
cd reservation-app
ng serve
```
Check: http://localhost:4200/

---

How to create and run an Angular project
```
ng new reservation-app
cd reservation-app
ng serve
```

How to create a service:
```
ng generate service reservation
```

How to run unit tests:
```
ng test
```

If you see: `Could not find module “@angular-devkit/build-angular”`  
Run this:
```
npm install --save-dev @angular-devkit/build-angular
```

---
Spring Boot, MongoDB, WebFlux, Angular