package blog.`in`.action

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ActionInBlogApplicationTests {

    @Test
    fun contextLoads() {
        assertEquals("1", "1")
    }
}
