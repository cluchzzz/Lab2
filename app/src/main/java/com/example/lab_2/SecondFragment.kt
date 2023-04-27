package com.example.lab_2
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.lab_2.databinding.MoviesInfoBinding


class SecondFragment : Fragment() {

    private lateinit var binding: MoviesInfoBinding

    private val args: SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MoviesInfoBinding.inflate(layoutInflater, container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.back.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(args.movieData.watch))
            startActivity(intent)
        }

        binding.SecondDescription.text = args.movieData.dsecond
        binding.SecondName.text = args.movieData.name

        Glide.with(binding.SecondImage.context)
            .load(args.movieData.image)
            .into(binding.SecondImage)
    }
}