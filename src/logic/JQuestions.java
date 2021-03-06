package logic;/*
 * Licensed to the Free Software Foundation (FSF) under one or more
 * contributor license agreements. The FSF licenses this file to You under
 * the GNU General Public License, Version 3.0 (the "License"); you may
 * not use this file except in compliance with the License.  You may obtain
 * a copy of the License at
 *
 *      http://www.gnu.org/licenses/gpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import java.util.ArrayList;

/**
 * This is just a place-holder class for the logic.JQuestions application object.
 * It stores the details associated with each instance of the application
 * in particular the Frame for the GUI, the pool of questions, the current
 * set of user answers (so far), and also the list of question Ids which
 * will change once the questions have been shuffled into random order.
 *
 * @author Ken Williams <jquestions@truerandomness.com>
 * @see
 */

public class JQuestions {


    // The pool from which questions are drawn.
    private static QuestionPool questionPool;

    // The ordered list of Ids (indices) of the questions asked.
    private final ArrayList<Integer> questionIds;

    // The list of user answers to the questions.
    private final ArrayList<JQUserAnswer> jQUserAnswers;


    public JQuestions() {
        questionPool = new QuestionPool();
        jQUserAnswers = new ArrayList<JQUserAnswer>();
        questionIds = new ArrayList<Integer>();
    }


    public static QuestionPool getQuestionPool() {
        return questionPool;
    }

    public ArrayList<JQUserAnswer> getUserAnswers() {
        return jQUserAnswers;
    }

    public ArrayList<Integer> getQuestionIds() {
        return questionIds;
    }

    public void clearAll() {
        questionPool.removeAllQuestions();
        jQUserAnswers.clear();
        questionIds.clear();
    }

    public void readResourceFile(final String fileName, Class classRef) {
        IOUtils.readFile(fileName, questionPool, classRef);
    }

    public void readFile(final String fileName) {
        IOUtils.readFile(fileName, questionPool, null);
    }

}
