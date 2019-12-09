package com.example.largecollectiontest

import com.google.firebase.Timestamp

class TestObject (var name: String = "default name", var descriptor: String =
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
        " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
        " when an unknown printer took a galley of type and scrambled it to make a type " +
        "specimen book. It has survived not only five centuries, but also the leap into " +
        "electronic typesetting, remaining essentially unchanged. It was popularised in the " +
        "1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more" +
        " recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                  var testDestription2: String = "It is a long established fact that a reader will be distracted " +
                          "by the readable content of a page when looking at its layout. The point of using Lorem " +
                          "Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using " +
                          "'Content here, content here', making it look like readable English. Many desktop publishing " +
                          "packages and web page editors now use Lorem Ipsum as their default model text, and a search" +
                          " for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have " +
                          "evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
                  var users: List<Long> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 23423, 3454234, 342452345, 32545345, 3254354354, 3525342534, 345235434,
                      1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,
                      48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,
                      93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,
                      129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,
                      164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,
                      199,200), var testSubObject: TestSubObject = TestSubObject(), map: Map<String, String> = mapOf(Pair("Test", "Test")), var isThisTest: Boolean = true, var time: Timestamp = Timestamp.now(), var date: Timestamp = Timestamp.now(),
                  var sync: Long = 23423424343)

class  TestSubObject(var name: String = "default name", var descriptor: String =
    "Lorem Ipsum is simply dummy text of the printing and typesetting industry." +
            " Lorem Ipsum has been the industry's standard dummy text ever since the 1500s," +
            " when an unknown printer took a galley of type and scrambled it to make a type " +
            "specimen book. It has survived not only five centuries, but also the leap into " +
            "electronic typesetting, remaining essentially unchanged. It was popularised in the " +
            "1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more" +
            " recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
                     var testDestription2: String = "It is a long established fact that a reader will be distracted " +
                             "by the readable content of a page when looking at its layout. The point of using Lorem " +
                             "Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using " +
                             "'Content here, content here', making it look like readable English. Many desktop publishing " +
                             "packages and web page editors now use Lorem Ipsum as their default model text, and a search" +
                             " for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have " +
                             "evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).",
                     var users: List<Long> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 23423, 3454234, 342452345, 32545345, 3254354354, 3525342534, 345235434,
                         1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,
                         48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,91,92,
                         93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126,127,128,
                         129,130,131,132,133,134,135,136,137,138,139,140,141,142,143,144,145,146,147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163,
                         164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181,182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198,
                         199,200))



class DifferentObject(var testObject: TestObject = TestObject())