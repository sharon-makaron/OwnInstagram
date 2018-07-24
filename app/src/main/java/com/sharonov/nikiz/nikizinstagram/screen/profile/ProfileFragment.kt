package com.sharonov.nikiz.nikizinstagram.screen.profile


import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.view.*
import com.sharonov.nikiz.nikizinstagram.R
import com.sharonov.nikiz.nikizinstagram.screen.user_settings.AccountSettingsActivity
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.snippet_top_profilebar.*

class ProfileFragment : Fragment() {

    companion object {
        fun newInstance(): ProfileFragment = ProfileFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        setHasOptionsMenu(true)
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setupToolbar()
        profileProgressBar.visibility = View.GONE
    }

    private fun setupToolbar() {
        (activity as AppCompatActivity).setSupportActionBar(profileToolbar)
        profileMenu.setOnClickListener { startActivity(Intent(activity, AccountSettingsActivity::class.java)) }
    }
}
