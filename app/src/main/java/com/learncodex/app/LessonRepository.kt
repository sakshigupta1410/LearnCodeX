package com.learncodex.app

object LessonRepository {

    fun getLessonsForLanguage(language: String): List<Lesson> {
        return when (language.uppercase()) {
            "JAVA" -> listOf(
                Lesson("Introduction to Java", "introduction_to_java.md"),
                Lesson("Data Types and Variables", "data_types_and_variables.md"),
                Lesson("Operators", "operators.md"),
                Lesson("If - else Statements", "if_else.md"),
                Lesson("Switch Statements", "switch.md"),
                Lesson("While loop", "while.md"),
                Lesson("for loop", "for_loop.md"),
                Lesson("Arrays", "arrays.md"),
                Lesson("Class Methods", "methods.md"),
                Lesson("Object-Oriented Concepts", "object_oriented_concepts.md"),
                Lesson("Inheritance", "inheritance.md"),
                Lesson("Polymorphism", "Polymorphism.md"),
                Lesson("Interfaces and Abstract Classes", "abstraction_and_interfaces.md"),
                Lesson("Constructors", "constructors.md"),
                Lesson("Exception Handling", "Exception_Handling.md"),
                Lesson("Collections Framework", "collection_frame.md"),
                Lesson("File Handling", "File_Handling.md"),
                Lesson("Multithreading", "multithreading.md"),
                Lesson("Basics of GUI Programming (Swing, JavaFX)", "gui_programming.md"),
                Lesson("Java Virtual Machine (JVM) and Java Runtime Environment (JRE)", "jvm.md"),
                Lesson("Platform independence", "platform_independence.md"),
                Lesson("Memory management", "memory.md"),
                Lesson("Garbage collection", "garbage.md")
            )

            "PYTHON" -> listOf(
                Lesson("Introduction to Python", "python_intro.md"),
                Lesson("Variables & Data Types", "python_variables.md"),
                Lesson("Operators", "operators.md"),
                Lesson("Conditional Statements", "conditional_statements.md"),
                Lesson("Loops", "loops.md"),
                Lesson("Lists, Tuples, Sets, Dictionaries", "Lists_Tuples_Sets_Dictionaries_P.md"),
                Lesson("Functions", "Functions.md"),
                Lesson("File Handling", "file_handling.md"),
                Lesson("Exception Handling", "exception_handling.md"),
                Lesson("Object-Oriented Programming", "oop.md"),
                Lesson("Modules and Packages", "modules_packages.md"),
                Lesson("Lambda Functions", "lambda.md"),
                Lesson("List Comprehensions", "list_comp.md"),
                Lesson("Python Libraries Overview (NumPy, Pandas, etc.)", "libraries.md"),

                // New Chapters
                Lesson("Decorators", "decorators.md"),
                Lesson("Generators & Iterators", "generators_iterators.md"),
                Lesson("Working with JSON & APIs", "json_apis.md"),
                Lesson("Date and Time Handling", "datetime.md"),
                Lesson("Regular Expressions", "regex.md"),
                Lesson("Virtual Environments & pip", "venv_pip.md"),
                Lesson("Unit Testing with unittest/pytest", "testing.md"),
                Lesson("Concurrency & Multithreading", "concurrency.md"),
                Lesson("Working with Databases (SQLite/MySQL)", "databases.md"),
                Lesson("The Pythonic Way: Idioms & Best Practices", "pythonic.md"),
                Lesson("Context Managers & the 'with' Statement", "context_managers.md"),
                )


            "C" -> listOf(
                Lesson("Introduction to C", "introduction_to_c.md"),
                Lesson("Data Types and Variables", "data_types_and_variables_c.md"),
                Lesson("Operators", "operators.md"),
                Lesson("Conditional Statements (if, else, switch)", "conditional_statements_c.md"),
                Lesson("Loops (for, while, do-while)", "loops_c.md"),
                Lesson("Functions", "functions_c.md"),
                Lesson("Arrays", "arrays_c.md"),
                Lesson("Strings", "strings_c.md"),
                Lesson("Pointers", "pointers_c.md"),
                Lesson("Structures and Unions", "structures_and_unions_c.md"),
                Lesson("Dynamic Memory Allocation", "dynamic_memory_allocation_c.md"),
                Lesson("File Handling", "file_handling_c.md"),
                Lesson("Preprocessor Directives and Macros", "preprocessor_directives_c.md"),
                Lesson("Bitwise Operators", "bitwise_operators_c.md"),
                Lesson("Command Line Arguments", "command_line_arguments_c.md"),
                Lesson("Recursion Basics", "recursion_basics_c.md"),

                // New Chapters
                Lesson("Enumerations (enum)", "enumerations_c.md"),
                Lesson("Storage Classes (auto, static, extern, register)", "storage_classes_c.md"),
                Lesson("Memory Layout of C Programs", "memory_layout_c.md"),
                Lesson("Function Pointers", "function_pointers_c.md"),
                Lesson("Multi-dimensional Arrays", "multi_dimensional_arrays_c.md"),
                Lesson("Error Handling in C", "error_handling_c.md"),
                Lesson("Modular Programming in C", "modular_programming_c.md"),
                Lesson("Linked Lists (Basics)", "linked_lists_c.md"),
                Lesson("Debugging and Compilation Tools (gcc, gdb)", "debugging_tools_c.md"),
                )


            "CPP" -> listOf(
                Lesson("Introduction to C++", "cpp_intro.md"),
                Lesson("Data Types and Variables", "cpp_data_types_variables.md"),
                Lesson("Operators", "cpp_operators.md"),
                Lesson("Control Flow Statements", "cpp_control_flow.md"),
                Lesson("Functions and Overloading", "cpp_functions_overloading.md"),
                Lesson("Arrays and Strings", "cpp_arrays_strings.md"),
                Lesson("Pointers and References", "cpp_pointers_references.md"),
                Lesson("Classes and Objects", "cpp_classes_objects.md"),
                Lesson("Constructors and Destructors", "cpp_constructors_destructors.md"),
                Lesson("Inheritance", "cpp_inheritance.md"),
                Lesson("Polymorphism", "cpp_polymorphism.md"),
                Lesson("Templates", "cpp_templates.md"),
                Lesson("Exception Handling", "cpp_exception_handling.md"),
                Lesson("File I/O", "cpp_file_io.md"),
                Lesson("Standard Template Library (STL) Overview", "cpp_stl_overview.md"),
                Lesson("Namespaces", "cpp_namespaces.md"),

                // New Chapters
                Lesson("Dynamic Memory Management (new/delete)", "cpp_dynamic_memory.md"),
                Lesson("Operator Overloading", "cpp_operator_overloading.md"),
                Lesson("Friend Functions and Classes", "cpp_friend_functions.md"),
                Lesson("Static Members and Functions", "cpp_static_members.md"),
                Lesson("Lambda Expressions (C++11+)", "cpp_lambda.md"),
                Lesson("Smart Pointers (unique_ptr, shared_ptr)", "cpp_smart_pointers.md"),
                Lesson("Move Semantics and Rvalue References", "cpp_move_semantics.md"),
                Lesson("Multithreading Basics", "cpp_multithreading.md"),
                Lesson("Type Casting (static_cast, dynamic_cast, etc.)", "cpp_type_casting.md"),
                )


            "KOTLIN" -> listOf(
                    Lesson("Introduction to Kotlin", "kotlin_intro.md"),
                    Lesson("Variables and Data Types", "kotlin_variables_data_types.md"),
                    Lesson("Functions", "kotlin_functions.md"),
                    Lesson("Control Flow (if, when)", "kotlin_control_flow.md"),
                    Lesson("Loops", "kotlin_loops.md"),
                    Lesson("Null Safety", "kotlin_null_safety.md"),
                    Lesson("Classes and Objects", "kotlin_classes_objects.md"),
                    Lesson("Constructors", "kotlin_constructors.md"),
                    Lesson("Inheritance", "kotlin_inheritance.md"),
                    Lesson("Interfaces and Abstract Classes", "kotlin_interfaces_abstract_classes.md"),
                    Lesson("Collections (Lists, Sets, Maps)", "kotlin_collections.md"),
                    Lesson("Lambdas and Higher-Order Functions", "kotlin_lambdas_higher_order.md"),
                    Lesson("Data Classes", "kotlin_data_classes.md"),
                    Lesson("Extension Functions", "kotlin_extension_functions.md"),
                    Lesson("Coroutines Basics", "kotlin_coroutines_basics.md"),
                    Lesson("Exception Handling", "kotlin_exception_handling.md")
                )

            "HTML" -> listOf(
                    Lesson("Introduction to HTML", "html_intro.md"),
                    Lesson("Basic Structure of HTML Document", "html_basic_structure.md"),
                    Lesson("Headings, Paragraphs, and Text Formatting", "html_headings_paragraphs.md"),
                    Lesson("Links and Images", "html_links_images.md"),
                    Lesson("Lists (Ordered, Unordered, Description)", "html_lists.md"),
                    Lesson("Tables", "html_tables.md"),
                    Lesson("Forms and Input Elements", "html_forms_input.md"),
                    Lesson("Semantic HTML5 Tags", "html_semantic_tags.md"),
                    Lesson("Audio and Video Elements", "html_audio_video.md"),
                    Lesson("Embedding Media and Objects", "html_embedding_media.md"),
                    Lesson("Meta Tags and SEO Basics", "html_meta_tags_seo.md"),
                    Lesson("HTML APIs (Canvas, Drag & Drop)", "html_apis.md"),
                    Lesson("Inline vs Block Elements", "html_inline_block.md"),
                    Lesson("HTML Entities", "html_entities.md"),
                    Lesson("Accessibility Basics", "html_accessibility.md"),
                    Lesson("Responsive HTML Layouts", "html_responsive_layouts.md")
                )

            "PHP" -> listOf(
                    Lesson("Introduction to PHP", "php_intro.md"),
                    Lesson("PHP Syntax and Variables", "php_syntax_variables.md"),
                    Lesson("Data Types", "php_data_types.md"),
                    Lesson("Operators", "php_operators.md"),
                    Lesson("Conditional Statements", "php_conditional_statements.md"),
                    Lesson("Loops", "php_loops.md"),
                    Lesson("Functions", "php_functions.md"),
                    Lesson("Arrays", "php_arrays.md"),
                    Lesson("String Manipulation", "php_string_manipulation.md"),
                    Lesson("Form Handling", "php_form_handling.md"),
                    Lesson("Sessions and Cookies", "php_sessions_cookies.md"),
                    Lesson("File Handling", "php_file_handling.md"),
                    Lesson("Object-Oriented Programming Basics", "php_oop_basics.md"),
                    Lesson("Exception Handling", "php_exception_handling.md"),
                    Lesson("Working with MySQL Database", "php_mysql_database.md"),
                    Lesson("PHP Security Basics", "php_security_basics.md")
                )

            "DART" -> listOf(
                    Lesson("Introduction to Dart", "dart_intro.md"),
                    Lesson("Variables and Data Types", "dart_variables_data_types.md"),
                    Lesson("Functions", "dart_functions.md"),
                    Lesson("Control Flow Statements", "dart_control_flow.md"),
                    Lesson("Classes and Objects", "dart_classes_objects.md"),
                    Lesson("Constructors", "dart_constructors.md"),
                    Lesson("Inheritance and Polymorphism", "dart_inheritance_polymorphism.md"),
                    Lesson("Mixins and Interfaces", "dart_mixins_interfaces.md"),
                    Lesson("Collections (Lists, Sets, Maps)", "dart_collections.md"),
                    Lesson("Null Safety", "dart_null_safety.md"),
                    Lesson("Async Programming (Futures, async/await)", "dart_async_programming.md"),
                    Lesson("Exception Handling", "dart_exception_handling.md"),
                    Lesson("Generics", "dart_generics.md"),
                    Lesson("Lambda Functions and Closures", "dart_lambda_closures.md"),
                    Lesson("Dart Packages and Libraries", "dart_packages_libraries.md"),
                    Lesson("Using Dart with Flutter (Intro)", "dart_flutter_intro.md")
                )


            // Add all your other languages here:
            // "KOTLIN" -> listOf(...)
            // "HTML" -> listOf(...)
            // "PHP" -> listOf(...)
            // "DART" -> listOf(...)

            else -> emptyList()
        }
    }
}
