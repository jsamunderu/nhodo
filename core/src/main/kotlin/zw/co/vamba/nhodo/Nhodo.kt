package zw.co.vamba.nhodo

import com.badlogic.gdx.Game
import zw.co.vamba.nhodo.FirstScreen

/** [com.badlogic.gdx.ApplicationListener] implementation shared by all platforms.  */
class Nhodo : Game() {
    override fun create() {
        setScreen(FirstScreen())
    }
}