package com.example.lab_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.lab_2.databinding.MoviesListBinding

class FirstFragment : Fragment() {

    lateinit var adapter: FirstAdapter
    lateinit var binding: MoviesListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = MoviesListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = FirstAdapter { movieData, _ ->
            findNavController().navigate(FirstFragmentDirections.FirstToSecond(movieData))
        }
        adapter.setNewData(createMovie())
        binding.rv.adapter = adapter

    }

    fun createMovie(): List<MovieData> {
        return listOf(
            MovieData(
                "Аутсайдери (2019)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wUCNtYcocuAmot4bkPKr1vxRLtA.jpg",
                "<b>Жанр:</b> Драма, Бойовик, Історичний<br><b>Світова прем'єра:</b>14/11/2019",
                "Сюжет оповідає про групу американських інженерів і дизайнерів. У 1960-х під керівництвом конструктора Керролла Шелбі і за підтримки британського гонщика Кена Майлса вони повинні були з нуля зробити абсолютно новий спорткар, здатний випередити Феррарі — непереможного чемпіона 24-годинної гонки на витривалість Ле-Ман.",
                "https://tv.apple.com/ua/movie/ford-v-ferrari/umc.cmc.6f6qe9muhuw7g21639iajetn1?action=play"
            ),
            MovieData(
                "Гонка (2013)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/6iUykgW47ZEuQmxDXiDkjIAYjvq.jpg",
                "<b>Жанр:</b> Драма, Бойовик<br><b>Світова прем'єра:</b> 27/09/2013",
                "70 -ті роки XX століття. Два непримиренних суперника в історії «Формули-1» - чарівний плейбой - англієць Джеймс Хант і дисциплінований перфекціоніст - австрієць Нікі Лауда - доводять себе до межі фізичної та психологічної витривалості заради тріумфу на трасі. Для них немає легких шляхів до перемоги і права на помилку. Єдиний промах гонщикам може коштувати кар'єри і навіть життя.",
                "https://tv.apple.com/ua/movie/umc.cmc.2n3ko6yr05rnlyj0pybkrru24?action=play"
            ),
            MovieData(
                "Пуститися берега (2008)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/yQAh12bfMjMRaGJupcKt5T5dUhz.jpg",
                "<b>Жанр:</b> Драма, Кримінал<br><b>Сезони:</b> 5<br><b>Світова прем'єра:</b> 20/01/2008",
                "Шкільний учитель хімії Волтер Вайт дізнається, що хворий на рак легенів. З огляду на складний фінансовий стан справ сім'ї, а також перспективи, Волтер вирішує зайнятися виготовленням метамфетаміну. Для цього він залучає свого колишнього учня Джессі Пінкмана, колись виключеного зі школи за активного сприяння Вайта. Пінкман сам займався «варінням мету», але напередодні, в ході рейду УБН, він позбувся напарника і лабораторії.",
                "https://www.netflix.com/ua/title/70143836?source=35"
            ),
            MovieData(
                "Мерзенна вісімка (2015)",
                "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/zUyaTFzXhk8HTJlwi6zwzjukCIQ.jpg",
                "<b>Жанр:</b> Драма, Детектив, Вестерн<br><b>Світова прем'єра:</b> 14/01/2016",
                "США після Громадянської війни. Легендарний мисливець за головами Джон Рут по кличці Вішатель конвоює ув'язнену. По дорозі до них прибивається ще один мисливець. Снігова буря змушує всіх трьох шукати укриття в крамниці на відшибі, де вже розташувалася вельми строката компанія: генерал, шериф, мексиканець, француз і ковбой ... І один з них - не той, за кого себе видає.",
                "https://megogo.net/ru/view/11949995-omerzitelnaya-vosmerka.html"
            ),
        )
    }
}