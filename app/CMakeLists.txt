cmake_minimum_required(VERSION 3.4.1)

add_library( # Sets the name of the library.
             main

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
             src/main/jni/name.cpp )


target_link_libraries( # Specifies the target library.
                       main

                     )