FROM openjdk:8
COPY C:\Users\Alora\Git_Public\CoffeeDemo\demo\src\main
WORKDIR C:\Users\Alora\Git_Public\CoffeeDemo\demo\src\main
RUN javac DemoApplication.java
CMD ["java", "DemoApplication"]