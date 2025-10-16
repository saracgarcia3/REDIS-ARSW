# REDIS-ARSW 


## Requisitos
- Java 8+ (compila en 8; funciona con 11/17/21 también)
- Maven
- Docker (para correr Redis)
# 📔​ REDIS-ARSW

1. Empezamos siguiendo el tutorial, aplicamos el siguiente comando el cual creara el **pom.xml**, **carpetas src/main/java**, **src/test/java**, etc:

<p align="center">
<img width="970" height="294" alt="image" src="https://github.com/user-attachments/assets/06b78540-8709-4608-a46a-67e274fc1d6f" />
</p>

2. Actualizamos el **pom.xml** con el que se nos especifico en la guia:
<p align="center">
<img width="685" height="207" alt="image" src="https://github.com/user-attachments/assets/b422312a-7d55-4a16-908f-eadc86dd2267" />
</p>

3. Compilamos y ejecutamos

<p align="center">
<img width="883" height="460" alt="image" src="https://github.com/user-attachments/assets/003f113c-965e-4a0b-a2e0-ebe13a5af198" />
</p>
<p align="center">
<img width="683" height="164" alt="image" src="https://github.com/user-attachments/assets/c55637bc-328c-43d5-bbea-91087459cd54" />
</p>
## Levantar Redis
```bash

docker run --name some-redis -p 45000:6379 -d redis
```

## Compilar y ejecutar
```bash
mvn clean package
java -cp target/RedisPubSubPrimer-1.0-SNAPSHOT.jar co.edu.escuelaing.redispubsubprimer.PSRedisPrimerAppStarter
```



## Notas
- Canal: `PSChannel`
- Mensajes: 6
- Receivers: 7 (scope prototype)
