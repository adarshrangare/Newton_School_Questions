<!-- HTML Indroduction -->
<!--HTML-->

# HTML
- Skeleton of Website.
- HyperTextMarkup Language .
- Cannot write Logic in Html.
- More like Presenting the Page.


- Create a Markup of the Website.
- Skeleton of Website.
- How to Create HTML File?
   - filename with html as a extension - index.html
   - There can be multiple html files in  a single project.
      - index.html(root file).
      - homepage.html
      - loginpage.html
      - registration.html
      - contact.html
      - about.html

- How to Run Html file?
- www.google.com ---> server (index.html)

- where can i write html code?
   - vs code
   - subLime
   - atom
   - brackets
   - codesandbox
   - stackblitz
   - codepen.io (online compiler)

- How to run html files? 
- we deploy to some live server.

<!--HTML Learnings -->

<!-- Html file Syntax-->
 <!-- Everything is a tag , pair of tags, self closing tags -->


 <!--HTML Tags -->
 
 1. Comment Tag <!--comment-->

 The comment tag is used to insert comments in the source code. Comments are not displayed in the browsers.
 Syntax: 

 <!--This is a comment. Comments are not displayed in the browser-->

2. <!DOCTYPE > declaration.

All HTML documents must start with a <!DOCTYPE> declaration.

The declaration is not an HTML tag. It is an "information" to the browser about what document type to expect

In HTML 5, the declaration is simple:

<!DOCTYPE html>

3. html Tag.

- The <html> tag represents the root of an HTML document.
- tag is the container for all other HTML elements.

4. head Tag. 
- The <head> element is a container for metadata (data about data) and is placed between the <html> tag and the <body> tag.

- Metadata is data about the HTML document. Metadata is not displayed.

- Metadata typically define the document title, character set, styles, scripts, and other meta information.

- The following elements can go inside the <head> element:

<title> (required in every HTML document)
<style>
<base>
<link>
<meta>
<script>
<noscript>

5. meta Tag.
<meta charset="UTF-8">
- Attribute charset	
- Value	character_set
- Description :

- Specifies the character encoding for the HTML    document.

 <meta name="viewport" content="width=device-width, initial-scale=1.0">

- Define keywords for search engines:
<!--Search engine optimization (SEO) is the art and science of getting pages to rank higher in search engines such as Google-->
<!--For Better Reach in Search Engine.-->
<meta name="keywords" content="HTML, CSS, JavaScript">

- Define a description of your web page:

<meta name="description" content="Free Web tutorials for HTML and CSS">

- Define the author of a page:

<meta name="author" content="John Doe">

- Refresh document every 30 seconds:

<meta http-equiv="refresh" content="30">

- Setting the viewport to make your website look good on all devices:

<meta name="viewport" content="width=device-width, initial-scale=1.0"





6. title Tag.

Note: There can only be one <title> element in an HTML document.

- The <title> tag defines the title of the document. The title must be text-only, and it is shown in the browser's title bar or in the page's tab.
- The <title> tag is required in HTML documents!

- The contents of a page title is very important for search engine optimization (SEO)! The page title is used by search engine algorithms to decide the order when listing pages in search results.

- The <title> element:

     - defines a title in the browser toolbar
     - provides a title for the page when it is added to favorite.
     - displays a title for the page in search-engine results.

7. body Tag.
Note: There can only be one <body> element in an HTML document.

- The <body> tag defines the document's body.
- The <body> element contains all the contents of an HTML document, such as:
    - headings, 
    - paragraphs,
    - images, 
    - hyperlinks,
    - tables
    - lists, etc.

   