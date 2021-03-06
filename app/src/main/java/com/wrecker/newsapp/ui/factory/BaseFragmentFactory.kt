package com.wrecker.newsapp.ui.factory

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.wrecker.newsapp.ui.adapter.NewsAdapter
import com.wrecker.newsapp.ui.fragments.NewsHeadlineFragment
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject


/**
 * converting with fragment factory to access newsAdapter by default.
 */
class BaseFragmentFactory @Inject constructor(
    private val newsAdapter: NewsAdapter
): FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when(className){
            /**
             * Returning the NewsHeadlineFragment
             */
            NewsHeadlineFragment::class.java.name -> NewsHeadlineFragment()
            else -> super.instantiate(classLoader, className)
        }

    }
}