# Como se fue configurando este repositorio

1. Instalar `leiningen` y `java`

   ```
   scoop install leiningen
   scoop bucket add java
   scoop install java/openjdk
   ```

1. Crear un projecto de libreria con `leiningen`

   ```
   cd <root del projecto>
   lein new default advent-of-code --to-dir .
   ```

1. Para ejecutar los tests
   ```
   lein test
   ```

1. Para iniciar una repl

   ```
   lein repl
   ```
   