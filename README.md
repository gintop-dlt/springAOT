# springAOT

### steps to build the project
### 1. run the gradle `build` task (this will create a jar file in `build\lib`)
### 2. run agent on the generated jar

```javascript
java -agentlib:native-image-agent=config-output-dir=./config,experimental-class-define-support -jar build\libs\springAOT-0.0.1-SNAPSHOT.jar
```
### 3. copy the generated files from `config` directory to `META-INF/native-image` folder
### 4. `build` the project again
### 5. then run the following in terminal

```javascript
gradlew nativeCompile
```
### 6. After succesful compilation it wil create a native binary under
`build\native\nativeCompile` folder

### 7. run the native binary

example: `build\native\nativeCompile\springAOT.exe`

## Note:

In windows x64 native tools command prompt is necessary to run the project.  The `nativeCompile` task will work only from x64 native tools command prompt

In linux there is no special requirement other than installing graalvm

The project require graalvm-ce-17
https://github.com/graalvm/graalvm-ce-builds/releases/tag/vm-22.3.2

The graalvm can be installed manually or if you are using Intellij you can download it from the IDE.

Don't forgot to set GRAALVM_HOME variable

