package com.example.emperor

class DataSource {
    var bals: Int = 0
    fun questions(): List<String> {
        return listOf(
            "1.Усами младенца глаголится ...\n\nA. Ересь \n\nB. Истина \n\nC. Кринж",
            "2.Вопрос означает ...\n\nA. Сомнение \n\nB. Ересь \n\nC. Вопрос",
            "3.Страх рождает ...\n\nA.Сомнение \n\nB.Верность \n\nC.Ересь",
            "4.Арбуз будешь?\n\nA.Да \n\nB.Нет \n\nC.Ересь" ,
        )
    }
}
