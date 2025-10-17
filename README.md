# 📔​ REDIS-ARSW
Este proyecto implementa un sistema de **Publish/Subscribe** utilizando **Redis** como broker de mensajes y **Spring Boot** como framework. Es ideal para aplicaciones que requieren **comunicación en tiempo real** a través de la publicación y suscripción a canales, seguimos el tutorial para su implementación:

## 🚀 **Características**
- **Publish/Subscribe** utilizando **Redis**.
- **7 Receptores (Listeners)** que reciben los mensajes enviados por el productor.
- Fácil de configurar y correr localmente con **Docker** y **Spring Boot**.

🖥️ Arquitectura del Proyecto

1. **PSRedisPrimerAppStarter**: el punto de entrada del proyecto, donde Spring Boot arranca la aplicación.
2. **PSRedisConnectionConfiguration:** configura la conexión a Redis utilizando Lettuce como cliente Redis de Spring.
3. **PSRedisListenerContainer:** un contenedor que maneja las suscripciones a los canales de Redis.
4. **PSRedisTemplate:** facilita la publicación de mensajes en Redis.
5. **Receiver:** un receptor que escucha los mensajes en el canal PSChannel.
6. **Producer:** un productor que envía mensajes al canal PSChannel.

## ⚙️ **Pasos para Ejecutar el Proyecto**

### 1. **Levantar Redis con Docker**
Primero se necesita tener **Docker** instalado y funcionando. Luego, se abre una terminal y se ejecuta el siguiente comando para iniciar Redis y vemos como corre en otra terminal:

```bash
docker run --name some-redis -p 45000:6379 -d redis
```
<p align="center">
<img width="883" height="460" alt="image" src="https://github.com/user-attachments/assets/003f113c-965e-4a0b-a2e0-ebe13a5af198" />
</p>
<p align="center">
<img width="683" height="164" alt="image" src="https://github.com/user-attachments/assets/c55637bc-328c-43d5-bbea-91087459cd54" />
</p>



