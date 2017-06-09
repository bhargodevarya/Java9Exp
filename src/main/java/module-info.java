/**
 * Created by Bhargo on 5/18/2017.
 */
module com.bhargo {
    requires com.profile;
    requires com.employer;
    requires com.bhargo.reader;
    requires com.bhargo.web;

    uses com.bhargo.reader.IReader;
}