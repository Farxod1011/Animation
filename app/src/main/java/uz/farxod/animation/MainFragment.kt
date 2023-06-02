package uz.farxod.animation

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import uz.farxod.animation.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        _binding = FragmentMainBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        val battareyAnim = binding.imgBattarey.drawable as AnimationDrawable
        battareyAnim.setEnterFadeDuration(1000)
        battareyAnim.setExitFadeDuration(1000)
        battareyAnim.start()

        with(binding){

            btAlpha.setOnClickListener {
                val alpha = AnimationUtils.loadAnimation(requireContext(), R.anim.alpha)
                text.startAnimation(alpha)
            }
            btScale.setOnClickListener {
                val scale = AnimationUtils.loadAnimation(requireContext(), R.anim.scale)
                text.startAnimation(scale)
            }
            btTranslate.setOnClickListener {
                val translate = AnimationUtils.loadAnimation(requireContext(), R.anim.translate)
                text.startAnimation(translate)
            }
            btRotate.setOnClickListener {
                val rotate = AnimationUtils.loadAnimation(requireContext(), R.anim.rotate)
                text.startAnimation(rotate)
            }
            btBounce.setOnClickListener {
                val bounce = AnimationUtils.loadAnimation(requireContext(), R.anim.bounce)
                text.startAnimation(bounce)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}