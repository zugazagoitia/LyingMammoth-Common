

# LyingMammoth-Common 
![GitHub release (latest by date)](https://img.shields.io/github/v/release/zugazagoitia/LyingMammoth-Common) [![Java CI](https://github.com/zugazagoitia/LyingMammoth-Common/actions/workflows/main.yml/badge.svg)](https://github.com/zugazagoitia/LyingMammoth-Common/actions/workflows/main.yml) [![License: AGPL v3](https://img.shields.io/badge/License-AGPL%20v3-blue.svg)](https://www.gnu.org/licenses/agpl-3.0) [![codecov](https://codecov.io/gh/zugazagoitia/LyingMammoth-Common/branch/master/graph/badge.svg?token=PVXCVQ9J4H)](https://codecov.io/gh/zugazagoitia/LyingMammoth-Common)


LyingMammoth-Common is a library containing models and utilities for its use across the LyingMammoth project.

## Installation

Use gradle.

```yml

repositories {
    mavenCentral()

    maven {
        url "https://repo.zugazagoitia.com"
    }
    
}

dependencies {

    implementation group: 'com.zugazagoitia.lyingMammoth', name:'common', version: '1.1'
}


```


Or else, use maven
```xml
<project>
  ...
  <repositories>
    <repository>
      <id>Zugazagoitia</id>
      <url>https://repo.zugazagoitia.com</url>
    </repository>
  </repositories>
  
 
  <dependencies>
    <dependency>
      <groupId>com.zugazagoitia.lyingMammoth</groupId>
      <artifactId>common</artifactId>
      <version>1.1</version>
    </dependency>
  </dependencies>
  
  ...
</project>


```


## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.
