package fi.ovatsia.listahomma

class Person(Name: String, Age: Int) {
    var _Name: String
        get() {
            return field
        }
    var _Age: Int
        get() {
            return field
        }

    init {
       _Name = Name
       _Age = Age
    }
}