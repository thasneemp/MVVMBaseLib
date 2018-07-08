[ ![Download](https://api.bintray.com/packages/muhammedthasneem1993/MVVMBase/MVVMBase/images/download.svg) ](https://bintray.com/muhammedthasneem1993/MVVMBase/MVVMBase/_latestVersion)

# MVVM Base Library 
The MVVM design pattern is similar to the well known MVC pattern in that the M (Model) and V (View) are relatively the same. The only difference resides between the C (Controller) and the VM (View Model).

This library is providing some base functionality of MVVM architecture and DataBinding.

* **Model**

    Represents the Data + State + Business logic. It is not tied to the view nor to the controller, which makes it reusable in many contexts.
    
* **View**

    Binds to observable variables and actions exposed by the View Model. It is possible for multiple views to bind to a single View Model.

* **ViewModel**

   Responsible for wrapping the model and preparing observable data needed by the view. It also provides hooks for the view to pass events to the model. An important thing to keep in mind is that the View Model is not tied to the view.
   
* **Data Binding**

   Introduced in Google I/O 2015, the Data Binding library helps write declarative layouts and minimize the glue code necessary to bind application logic and layouts.
   
## Dependency

Firstly, add repository in your root build.gradle file (not your module build.gradle file):

```
repositories {
    jcenter()
}
```

Add dependency to your module's build.gradle file:

```
dependencies {
    implementation 'com.mhdthasneemp.mvvmbase:MVVM-BASE:1.0'
}
```

#### Refrence

```
https://github.com/MindorksOpenSource/android-mvvm-architecture

```

#### License

````
Copyright [2018] [Muhammed Thasneem P]

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
````

